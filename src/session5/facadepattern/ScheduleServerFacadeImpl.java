package session5.facadepattern;

import java.util.Objects;

public class ScheduleServerFacadeImpl implements ScheduleServerFacade {

	private final ScheduleServer server;

	public ScheduleServerFacadeImpl(ScheduleServer server) {
		Objects.requireNonNull(server, "Cannot instantiate with a null server");
		this.server = server;
	}

	@Override
	public void startServer() {
		
		server.startBooting();
		server.readSystemConfigFile();
		server.init();
		server.initializeContext();
		server.initializeListeners();
		server.createSystemObjects();
		System.out.println("Start working......");
		System.out.println("After work done.........");	
	}

	@Override
	public void stopServer() {

		server.releaseProcesses();
		server.destory();
		server.destroySystemObjects();
		server.destoryListeners();
		server.destoryContext();
		server.shutdown();
	}
}
