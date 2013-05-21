package fr.app.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestapplicationActivity extends Activity implements android.view.View.OnClickListener {
    
	Button btn1 ;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn1=(Button)this.findViewById(R.id.btn_fr);
        btn1.setOnClickListener(this);
    }

	

	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent1 = new Intent(this,Menuprincipale.class);
		this.startActivity(intent1);
	}
}