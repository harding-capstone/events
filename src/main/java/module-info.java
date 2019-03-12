module com.shepherdjerred.capstone.events {
  requires static lombok;
  requires org.apache.logging.log4j;

  exports com.shepherdjerred.capstone.events;
  exports com.shepherdjerred.capstone.events.handlers;
}
