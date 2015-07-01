package mygwtproject.client.testApp;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.HTMLPanel;

public class testAppHome extends Composite {

	private static testAppHomeUiBinder uiBinder = GWT
			.create(testAppHomeUiBinder.class);
	@UiField Image dImage;
	@UiField HTMLPanel homeId;

	interface testAppHomeUiBinder extends UiBinder<Widget, testAppHome> {
	}

	public testAppHome() {
		initWidget(uiBinder.createAndBindUi(this));
	}

//	@UiHandler("mImage")
//	void onMImageClick(ClickEvent event) {
//	}
//	@UiHandler("dImage")
//	void onDImageClick(ClickEvent event) {
//	}
}
