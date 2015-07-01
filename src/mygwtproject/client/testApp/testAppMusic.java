package mygwtproject.client.testApp;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;

public class testAppMusic extends Composite {

	private static testAppMusicUiBinder uiBinder = GWT
			.create(testAppMusicUiBinder.class);
	@UiField HTMLPanel musicId;

	interface testAppMusicUiBinder extends UiBinder<Widget, testAppMusic> {
	}

	public testAppMusic() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
