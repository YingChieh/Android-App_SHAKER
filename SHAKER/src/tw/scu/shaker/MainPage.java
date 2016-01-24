package tw.scu.shaker;
import android.app.Activity; 
import android.os.Bundle; 
import android.widget.Button; 
import android.view.View; 
import android.content.Intent;
public class MainPage extends Activity  {
	private Button b1; 
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) { 
	super.onCreate(savedInstanceState); 
	 setContentView(R.layout.mainpage); 
	b1=(Button)findViewById(R.id.b1); 
	b1.setOnClickListener(new Button.OnClickListener(){ 
	public void onClick(View v){ 
	Intent intent = new Intent(); 
	 intent.setClass(MainPage.this, MainActivity.class); 
	 startActivity(intent); 
	 MainPage.this.finish(); 
	 } 
	 }); 
	 } 
}
