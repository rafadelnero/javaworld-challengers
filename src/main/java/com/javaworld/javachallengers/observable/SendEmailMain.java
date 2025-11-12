package com.javaworld.javachallengers.observable;

public class SendEmailMain {

  public static void main(String[] args) {
    Newsletter newsLetter = new Newsletter("Java Challengers");

    Observer duke = new Subscriber("Duke");
    Observer juggy = new Subscriber("Juggy");
    Observer dock = new Subscriber("Moby Dock");

    newsLetter.addSubscriber(duke);
    newsLetter.addNewEmail("Lambda Java Challenge");
    newsLetter.removeSubscriber(duke);

    newsLetter.addSubscriber(juggy);
    newsLetter.addSubscriber(dock);
    newsLetter.addNewEmail("Virtual Threads Java Challenge");
  }

}
