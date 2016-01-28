package it.unipd.math.pcd.actors;

import java.util.LinkedList;

public final class Mailbox<T extends Message> {
	private LinkedList<MailboxMsg<T>> mailbox=new LinkedList<>();
	
	public void add(MailboxMsg<T> m){
		mailbox.addFirst(m);
	}
	
	public void removeLast(){
		mailbox.removeLast();
	}
	
	public T getmessage(){
		return mailbox.getLast().getmessage();
	}

	public ActorRef<T> getsender(){
		return mailbox.getLast().getActorRef();
	}
	
	public int size(){
		return mailbox.size();
	}
	
}
