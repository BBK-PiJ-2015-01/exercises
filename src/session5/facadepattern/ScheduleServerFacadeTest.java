package session5.facadepattern;

import org.junit.Test;

public class ScheduleServerFacadeTest {

	@Test(expected = NullPointerException.class)
	public void nullConstructorTest() {

		new ScheduleServerFacadeImpl(null);
	}

	@Test
	public void validConstructorTest() {

		new ScheduleServerFacadeImpl(new ScheduleServerImpl());
	}

	@Test
	public void startServerTest() {

		ScheduleServerFacade instance = new ScheduleServerFacadeImpl(new ScheduleServerImpl());
		instance.startServer();
	}

	@Test
	public void stopServerTest() {

		ScheduleServerFacade instance = new ScheduleServerFacadeImpl(new ScheduleServerImpl());
		instance.stopServer();
	}

	class ScheduleServerImpl implements ScheduleServer {

		@Override
		public void startBooting() {
		}

		@Override
		public void readSystemConfigFile() {
		}

		@Override
		public void init() {
		}

		@Override
		public void initializeContext() {
		}

		@Override
		public void initializeListeners() {
		}

		@Override
		public void createSystemObjects() {
		}

		@Override
		public void releaseProcesses() {
		}

		@Override
		public void destory() {
		}

		@Override
		public void destroySystemObjects() {
		}

		@Override
		public void destoryListeners() {
		}

		@Override
		public void destoryContext() {
		}

		@Override
		public void shutdown() {
		}
	}
}
