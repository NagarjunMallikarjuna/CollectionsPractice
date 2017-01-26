package com.nagarjun.Collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CrunchifyConcurrentHashmap {

	public final static int THREAD_POOL_SIZE=5;
	
	public static Map<String, Integer> crunchifyHashTableObject = null;
	public static Map<String, Integer> crunchifySynchronizedMapObject = null;
	public static Map<String, Integer> crunchifyConcurrentHashMapObject = null;
	
	public static void main(String[] args) throws InterruptedException {
		crunchifyHashTableObject = new Hashtable<String, Integer>();
		crunchifyPerformTest(crunchifyHashTableObject);
		
		crunchifySynchronizedMapObject = Collections.synchronizedMap(new HashMap<String, Integer>());
		crunchifyPerformTest(crunchifySynchronizedMapObject);
		
		crunchifyConcurrentHashMapObject = new ConcurrentHashMap<String, Integer>();
		crunchifyPerformTest(crunchifyConcurrentHashMapObject);
		
	}
	
	public static void crunchifyPerformTest(final Map<String, Integer> crunchifyThreads) throws InterruptedException{
		System.out.println("Test started for: "+crunchifyThreads.getClass());
		long averageTime = 0;
		for(int i=0;i<5;i++){
			long startTime = System.nanoTime();
			ExecutorService crunchifyExServer = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
			
			for(int j=0; j< THREAD_POOL_SIZE;j++){
				crunchifyExServer.execute(new Runnable() {
					
					@Override
					public void run() {
						for(int i=0;i<50000;i++){
							Integer crunchifyRandomNumber = (int) Math.ceil(Math.random()*55000);
							Integer crunchifyValue = crunchifyThreads.get(String.valueOf(crunchifyRandomNumber));
							crunchifyThreads.put(String.valueOf(crunchifyRandomNumber), crunchifyRandomNumber);
						}
					}
				});
			}
			
			crunchifyExServer.shutdown();
			crunchifyExServer.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
			long endtime = System.nanoTime();
			long totalTime = (endtime-startTime)/1000000L;
			averageTime += totalTime;
			System.out.println("250k entired added/retreieved "+totalTime+"ms");
		}
	System.out.println("for"+crunchifyThreads.getClass()+" The average time is "+averageTime);
		
		
	}
	
	
}
