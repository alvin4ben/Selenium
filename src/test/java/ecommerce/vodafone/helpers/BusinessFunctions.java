package ecommerce.vodafone.helpers;

public class BusinessFunctions {
	
	public static long starttime() {
		long start = System.currentTimeMillis();
		System.out.println("Start " + start);
		return start;
	}

	public static long endtime(long start) {
		long finish = System.currentTimeMillis();
		System.out.println("Finish " + finish);

		long TotalTime = (((finish - start)/1000)%60);
		System.out.println("Total Time for vodafone portal login - "+TotalTime+" seconds");
		return TotalTime;
	}

}
