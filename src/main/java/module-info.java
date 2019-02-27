module com.shepherdjerred.capstone.events {
  requires static lombok;
  requires com.shepherdjerred.capstone.logic;
  requires com.shepherdjerred.capstone.common;
  exports com.shepherdjerred.capstone.events.chat;
  exports com.shepherdjerred.capstone.events.connection;
  exports com.shepherdjerred.capstone.events;
}
