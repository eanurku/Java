1. priority table in  org.apache.log4j.Priority class:


  public final static int OFF_INT = Integer.MAX_VALUE;
  public final static int FATAL_INT = 50000;
  public final static int ERROR_INT = 40000;
  public final static int WARN_INT  = 30000;
  public final static int INFO_INT  = 20000;
  public final static int DEBUG_INT = 10000;
    //public final static int FINE_INT = DEBUG_INT;
  public final static int ALL_INT = Integer.MIN_VALUE;

If priority is defined in log4j.properties, only the same or above priority message will be logged.

2.

    For standalone Java app, make sure the log4j.properties file is under the project/classes directory
    For Java web applications, make sure the log4j.properties file is under the WEB-INF/classes directory
