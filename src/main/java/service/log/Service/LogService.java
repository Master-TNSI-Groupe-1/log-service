package service.log.Service;

import service.log.entity.Attendances;
import service.log.entity.Location;
import service.log.repository.AttendancesRepository;
import service.log.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class LogService {

    @Autowired
    AttendancesRepository attendancesRepository;

    @Autowired
    LocationRepository locationRepository;

    private long LastHourInsert = -1;

    public void runService(){
        // Service qui tourne en continue
        while(true){

            try{
                Date datecurrent = new Date();

                if(datecurrent.getHours() != LastHourInsert){


                    //TODO
                    //if heure = nouvelle heure

                    int ticks = (int)datecurrent.getTime();
                    //Creation de la liste des nouveau attendances
                    List<Attendances> lstAjoutAttendances = new ArrayList<Attendances>();

                    // Récupération de tous les lieux
                    List<Location> lstLocation = (List<Location>)locationRepository.findAll();


                    // Pour chaque location trouver on rajoute une attendances
                    // avec le nombre de personne actuellement dedans et la date d'aujourd'hui
                    lstLocation.forEach(s -> {
                        Attendances attendancesTempo = new Attendances(datecurrent, s.getNumberUser(), s.getIdlocation(), ticks);
                        lstAjoutAttendances.add(attendancesTempo);


                    });

                    // Insertion en base de la liste
                    attendancesRepository.saveAll(lstAjoutAttendances);
                    LastHourInsert = datecurrent.getHours();
                }
                Thread.sleep(5000);
            }catch(Exception e)
            {
                System.out.println("Erreur : "+e.getMessage());
            }


        }
    }
}
