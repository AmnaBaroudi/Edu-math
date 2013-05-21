package fr.app.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class cours_alg extends Activity implements OnClickListener  {
	Button btn;
	Button btn1;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_cours);
        btn=(Button)this.findViewById(R.id.btn_identites);
		btn.setOnClickListener(this);
		btn1=(Button)this.findViewById(R.id.btn_regle_trois);
		btn1.setOnClickListener(this);
	}
	public void onClick(View click ) {
		if(click==btn){
			Intent intent3 = new Intent(this,cours_identite.class);
           this.startActivity(intent3);}
		
		if(click==btn1){
			Intent intent4 = new Intent(this,cours_identite.class);
           this.startActivity(intent4);}
		
	}

}