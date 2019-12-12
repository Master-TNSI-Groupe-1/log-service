class LogsJob{
	
	@Autowired
	LogsRepository logsRepo, daysRepo, hoursRepo;

	@Autowired
	CapteurRepository capteurRepository;


	public void runJob(){
		
		boolean isInit = false;

		while(true){
			
			Date currentDate = DateUtils.currentDate();

			if(currentDate.getHours() == 0 && currentDate.getMinutes() == 0){

				// On creer un nouveau jours.
				// On l'appelle currentDays.
				Date previousDate = DateUtils.getPreviousDate();

				// A developpé.
				List<HoursLogs> hoursLogs = getHoursLogsFromDate(prevousDate);


				DayLogs oldDayLogs = new DayLogs(hoursLogs, prevousDate);
				
				logsRepo.save(oldDayLogs);

			}else if(currentDate.getMinutes() == 0){
				HoursLogs currentLogs = getLogFromCapteur();
				hoursRepo.save(currentLogs);
			}


			Thread.sleep(1000);

		}

	}


	private HoursLogs getLogsFromCapteur(){
		List<Log> logList = new ArrayList<Log>();

		for(currentCapteur : capteurRepository){
			logList.push(new Log(currentCapteur.getId(), currentCapteur.getTraficActu(), currentCapteur.getTraficMax()));
		}

		HoursLogs currentHoursLogs = new HoursLogs(logList, new Date());

		return currentHoursLogs;
	}
}