package factory;

import create.*;

public abstract class AbstractHumanFactory {
	public abstract Human createHuman(Class<? extends Human> c);

}