package it.unipd.math.pcd.actors;

public final class MailboxMsg<T extends Message> {
		private final T message;
		private final ActorRef<T> sender;
		public MailboxMsg(T msg,ActorRef<T> s){
			message=msg; sender=s;
		}
		
		public T getmessage(){
			return message;
		}
		public ActorRef<T> getActorRef(){
			return sender;
		}

}
