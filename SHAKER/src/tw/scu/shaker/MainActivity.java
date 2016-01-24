package tw.scu.shaker;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity{
	
	private ImageButton imgBtn1, imgBtn2, imgBtn3, imgBtn4, imgBtn5,
	imgBtn6,imgBtn7,imgBtn8,imgBtn9,imgBtn10,imgBtn11,imgBtn12,
	imgBtn13,imgBtn14,imgBtn15,imgBtn16;
	
	private ImageView imgCup;
	
	private static String[] mGest = { "absinthe", "calvados", "champagne","cognac","cointreau","creme de cacao",
		"creme de menthe", "gin","kahlua","lime juice","sambuca","tequila","triple sec","vermouth","vodka","whisky"};
	public int flag = 0;
	Vibrator vibrator = null;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		 setContentView(R.layout.mainpage); 
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.LinearLayout1);
		imgBtn1 = (ImageButton)findViewById(R.id.imageButton1);		imgBtn2 = (ImageButton)findViewById(R.id.imageButton2);
		imgBtn3 = (ImageButton)findViewById(R.id.imageButton3);		imgBtn4 = (ImageButton)findViewById(R.id.imageButton4);
		imgBtn5 = (ImageButton)findViewById(R.id.imageButton5);		imgBtn6 = (ImageButton)findViewById(R.id.imageButton6);
		imgBtn7 = (ImageButton)findViewById(R.id.imageButton7);		imgBtn8 = (ImageButton)findViewById(R.id.imageButton8);
		imgBtn9 = (ImageButton)findViewById(R.id.imageButton9);		imgBtn10 = (ImageButton)findViewById(R.id.imageButton10);
		imgBtn11 = (ImageButton)findViewById(R.id.imageButton11);		imgBtn12 = (ImageButton)findViewById(R.id.imageButton12);
		imgBtn13 = (ImageButton)findViewById(R.id.imageButton13);		imgBtn14 = (ImageButton)findViewById(R.id.imageButton14);
		imgBtn15 = (ImageButton)findViewById(R.id.imageButton15);		imgBtn16 = (ImageButton)findViewById(R.id.imageButton16);
		
		imgCup = (ImageView)findViewById(R.id.imageView1);
		//shake = (ImageView)findViewById(R.id.imageView2);
		imgBtn1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[0] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[1] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn3.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[2] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn4.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[3] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn5.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[4] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn6.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[5] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn7.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[6] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn8.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[7] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn9.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[8] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn10.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[9] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn11.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[10] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn12.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[11] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn13.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[12] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn14.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[13] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn15.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[14] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		imgBtn16.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				if(flag<5){
					Toast.makeText(MainActivity.this, "你選了" + mGest[15] , Toast.LENGTH_SHORT).show();
					flag++;
					changeCup(flag);
				}
				else
					Toast.makeText(MainActivity.this, "調酒器已滿" , Toast.LENGTH_SHORT).show();
			}
		});
		

		if(flag==5){

		Intent intent = new Intent(); 
		intent.setClass(MainActivity.this, Second.class); 
		startActivity(intent); 
		MainActivity.this.finish();
		}
		
	}
	
	private void changeCup(int flag) {
		final Resources res = this.getResources();
		switch (flag) {
		case 1:
			imgCup.setImageDrawable(res.getDrawable(R.drawable.c1));
			break;
		case 2:
			imgCup.setImageDrawable(res.getDrawable(R.drawable.c2));
			break;
		case 3:
			imgCup.setImageDrawable(res.getDrawable(R.drawable.c3));
			break;
		case 4:
			imgCup.setImageDrawable(res.getDrawable(R.drawable.c4));
			break;
		case 5:
			imgCup.setImageDrawable(res.getDrawable(R.drawable.c5));
			//for(int i=0; i<16; i++)
			//	imgBtn[i].setEnabled(false);			
			//shake.setVisibility(1);
			//ly1.setBackgroundDrawable(res.getDrawable(R.drawable.shake));
			
			imgBtn1.setEnabled(false); imgBtn2.setEnabled(false); imgBtn3.setEnabled(false);
			imgBtn4.setEnabled(false); imgBtn5.setEnabled(false); imgBtn6.setEnabled(false);
			imgBtn7.setEnabled(false); imgBtn8.setEnabled(false); imgBtn9.setEnabled(false);
			imgBtn10.setEnabled(false); imgBtn11.setEnabled(false); imgBtn12.setEnabled(false);
			imgBtn13.setEnabled(false); imgBtn14.setEnabled(false); imgBtn15.setEnabled(false);
			imgBtn16.setEnabled(false); imgCup.setEnabled(false);
			
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("調製指南")
			.setMessage("開始搖動手機")
			.setIcon(res.getDrawable(R.drawable.timetoshake))
			.setPositiveButton("Ok", null).show();	
			Intent intent = new Intent(); 
			intent.setClass(MainActivity.this, Second.class); 
			startActivity(intent); 
			MainActivity.this.finish();
			break;
		default:
			break;
		}
		
	}
	
	// Menu選單
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.how:
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("調製指南")
			.setMessage("1.點選各種材料\n2.將杯子裝滿\n3.開始搖動手機\n4.看看你能不能得到高分")
			.setPositiveButton("Ok", null).show();
			break;
		case R.id.about:
			AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
			builder2.setTitle("關於 Cocktail Shakers")
			.setMessage("版本：1.0版\n組別：第六組")
			.setPositiveButton("Ok", null).show();
			break;
		case R.id.quit:
			finish();
			break;
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
