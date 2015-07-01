package mygwtproject.client.testApp;

import java.util.Date;



import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DatePicker;


public class testAppDance extends Composite implements ValueChangeHandler {

	private static testAppDanceUiBinder uiBinder = GWT
			.create(testAppDanceUiBinder.class);
	

	interface testAppDanceUiBinder extends UiBinder<Widget, testAppDance> {
	}

	
	private DatePicker datePicker = new DatePicker();
	private TextBox textBox = new TextBox();
	private Image icon = new Image("gwtproject/gwt/clean/images/calendar_icon.png");
	private TextBox textBoxName = new TextBox();
	private  Label label1  =new Label();
	private  Label label2  =new Label();
	private VerticalPanel vP = new VerticalPanel();
	private HorizontalPanel hP = new HorizontalPanel();
	private HorizontalPanel hP1 = new HorizontalPanel();
	
	
	public testAppDance() {
		
		    datePicker.addValueChangeHandler(new ValueChangeHandler<Date>() {
		    	
		    	// Set format of date
		    	
		        @Override
		        public void onValueChange(ValueChangeEvent<Date> event) {
		        	DateTimeFormat df = DateTimeFormat.getFormat("MM/dd/yyyy");
		            Date date = event.getValue();
		            String dateStr = df.format(date);
		            textBox.setText(dateStr);
		            datePicker.setVisible(false);
		        }
		    });
		    
		    datePicker.setVisible(false);
		    icon.addClickHandler(new ClickHandler() {

		        @Override
		        public void onClick(ClickEvent event) {
		            datePicker.setVisible(true);        
		        }
		    });

		    // Creating labels for Name
		    
		    label1.setText("Name");
		    label1.setWidth("60px");
		    hP.setSpacing(10);
		    hP.add(label1);
		    hP.add(textBoxName);
		    vP.add(hP);
		    
		    //Creating label for Date
		    
		    label2.setText("Started");
		    label2.setWidth("60px");
		    hP1.setSpacing(10);
		    hP1.add(label2);
		    hP1.add(textBox);
		    hP1.add(icon);
		    hP1.add(datePicker);
		    vP.add(hP1);
		    
		    //Creating Reset Button
		    
		    Button resetButton = new Button("Reset");
		    vP.add(resetButton);
		    resetButton.setWidth("100px");
		    
		    //Handling Reset button when clicked
		    
		    resetButton.addClickHandler(new ClickHandler() {
		         @Override
		         public void onClick(ClickEvent event) {
		            System.out.println("Name -> "+textBoxName.getText() +" Started -> "+ textBox.getText());
		        	 textBoxName.setText("");
		        	 textBox.setText("");
		         }
		      });
		 
		    initWidget(vP);
		    
		}


	@Override
	public void onValueChange(ValueChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
		
	

}
