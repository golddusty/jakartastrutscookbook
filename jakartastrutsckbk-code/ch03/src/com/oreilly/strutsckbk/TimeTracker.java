package com.oreilly.strutsckbk;

import java.util.Date;
import java.util.HashMap;

public class TimeTracker {
   
   private long startUpTimeMillis;
   private Date startedOn;
   private HashMap someMap = new HashMap(5);
   
   public TimeTracker() {
   	startUpTimeMillis = System.currentTimeMillis();
      startedOn = new Date();
      for (int i=0; i<5;i++) someMap.put(new Integer(i),"Value"+i);
   }

   public long getUptime() {
   	return System.currentTimeMillis() - startUpTimeMillis;
   }

   public Date getStartedOn() {
   	return startedOn;
   }

   public HashMap getSomeMap() {
   	return someMap;
   }
}
