
package it.unipd.math.pcd.actors;

public final class ActorRefLocal<T extends Message> implements ActorRef<T>{
	private ActorSystemImpl Asi;
	public ActorRefLocal(ActorSystemImpl system){Asi=system;}
	@Override
	public int compareTo(ActorRef ar) {
		 return ( this == ar ) ? 0 : -1;
	}

	@Override
	public void send(T message, ActorRef to) {
		
		AbsActor a=(AbsActor) Asi.getActor(to);
		a.SendRequestMessage(message,this);
	}
	

	
}

