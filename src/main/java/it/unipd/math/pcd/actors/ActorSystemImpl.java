package it.unipd.math.pcd.actors;

import it.unipd.math.pcd.actors.exceptions.NoSuchActorException;



public final class ActorSystemImpl extends AbsActorSystem{	

	@Override
	public void stop(ActorRef<?> actor) throws NoSuchActorException {
			if (actors.containsKey(actor)){
				AbsActor a=(AbsActor) getActor(actor);
				a.set_stop_at_true();
				actors.remove(actor);
			}
			else
				{throw new NoSuchActorException();}
	}

	@Override
	public void stop() {
		 for (ActorRef<?> actor : actors.keySet()) {
	            this.stop(actor);
	      }
		
	}

	@Override
	protected ActorRef createActorReference(ActorMode mode) {
		if( mode == ActorMode.LOCAL )
        {	
            return new ActorRefLocal(this);
        }
        else
        {
        	 throw new IllegalArgumentException();
        }
	}
}
