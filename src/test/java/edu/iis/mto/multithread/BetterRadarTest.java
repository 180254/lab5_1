package edu.iis.mto.multithread;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.concurrent.Executor;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;

public class BetterRadarTest {

	@Rule
	public RepeatRule repeatRule = new RepeatRule();

	@Test
	@Repeat(times = 10000)
	public void launchPatriot10TimesWhenNoticesAScudMissle() {
		Executor exec = new Executor() {

			@Override
			public void execute(Runnable command) {
				command.run();
			}
		};

		PatriotBattery batteryMock = mock(PatriotBattery.class);
		BetterRadar radar = new BetterRadar(batteryMock, exec);
		radar.notice(new Scud());

		verify(batteryMock, Mockito.times(10)).launchPatriot();
	}
}
