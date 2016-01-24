package tw.scu.shaker;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.view.View;
import android.widget.ImageView;
import android.content.res.Resources;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
public class Second  extends Activity implements SensorEventListener{

	/**
	 * @param args
	 */
	private ImageView ly1;
	private SensorManager sensorManager;
	private long lastUpdate;
	private float[] mGravity = new float[3];
	private float[] mLinearAcc = new float[3];
	private boolean mFULL = false;
	private Random mRand = new Random();
	int gesture = mRand.nextInt(7);
	
	Vibrator vibrator = null;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		   
		  super.onCreate(savedInstanceState); 
		  setContentView(R.layout.second);
		 
		  
		  sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		  sensorManager.registerListener(this,
		    sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
		    SensorManager.SENSOR_DELAY_NORMAL);
		  lastUpdate = System.currentTimeMillis();
		 }
	
	// 體感(搖飲料)
			@Override
			protected void onResume() {
				super.onResume();
				// register this class as a listener for the orientation and
				// accelerometer sensors
				// 方向傳感器： Sensor.TYPE_ORIENTATION，
				// 加速度(重力)傳感器： Sensor.TYPE_ACCELEROMETER
				// 距離(臨近性)傳感器： Sensor.TYPE_PROXIMITY
				
				sensorManager.registerListener(this,
						sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
						sensorManager.SENSOR_DELAY_NORMAL);
			}
			
			@Override
			protected void onPause() {
				// unregister listener
				super.onPause();
				sensorManager.unregisterListener(this);
				super.onStop();
			}
			
			@Override
			public void onAccuracyChanged(Sensor arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onSensorChanged(SensorEvent event) {
				// TODO Auto-generated method stub
				if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
					final float alpha = (float) 0.8;
					for(int k=0; k<3; k++) {
						mGravity[k] = alpha * mGravity[k] + ( 1 - alpha) * event.values[k];
						mLinearAcc[k] = event.values[k] - mGravity[k];
					}
					long actualTime = System.currentTimeMillis();
					
					if (actualTime - lastUpdate < 300) {
						return;
					}
					float shake = mLinearAcc[1]; // y
					
					if (shake < -2) {
						
						if(gesture==0){
						lastUpdate = actualTime;
						 ly1=(ImageView)findViewById(R.id.imageView1);
						  ly1.setImageDrawable(getResources().getDrawable(R.drawable.a));
						  ly1.setVisibility(1);
						//搖動手機後，再伴隨震動提示~~
						//vibrator.vibrate(500);
						mFULL = true;}
						
						if(gesture==1){
							lastUpdate = actualTime;
							 ly1=(ImageView)findViewById(R.id.imageView1);
							  ly1.setImageDrawable(getResources().getDrawable(R.drawable.a));
							  ly1.setVisibility(1);
							//搖動手機後，再伴隨震動提示~~
							//vibrator.vibrate(500);
							mFULL = true;}
						if(gesture==2){
							lastUpdate = actualTime;
							 ly1=(ImageView)findViewById(R.id.imageView1);
							  ly1.setImageDrawable(getResources().getDrawable(R.drawable.b));
							  ly1.setVisibility(1);
							//搖動手機後，再伴隨震動提示~~
							//vibrator.vibrate(500);
							mFULL = true;}
						if(gesture==3){
							lastUpdate = actualTime;
							 ly1=(ImageView)findViewById(R.id.imageView1);
							  ly1.setImageDrawable(getResources().getDrawable(R.drawable.c));
							  ly1.setVisibility(1);
							//搖動手機後，再伴隨震動提示~~
							//vibrator.vibrate(500);
							mFULL = true;}
						if(gesture==4){
							lastUpdate = actualTime;
							 ly1=(ImageView)findViewById(R.id.imageView1);
							  ly1.setImageDrawable(getResources().getDrawable(R.drawable.d));
							  ly1.setVisibility(1);
							//搖動手機後，再伴隨震動提示~~
							//vibrator.vibrate(500);
							mFULL = true;}
						if(gesture==5){
							lastUpdate = actualTime;
							 ly1=(ImageView)findViewById(R.id.imageView1);
							  ly1.setImageDrawable(getResources().getDrawable(R.drawable.e));
							  ly1.setVisibility(1);
							//搖動手機後，再伴隨震動提示~~
							//vibrator.vibrate(500);
							mFULL = true;}
						if(gesture==6){
							lastUpdate = actualTime;
							 ly1=(ImageView)findViewById(R.id.imageView1);
							  ly1.setImageDrawable(getResources().getDrawable(R.drawable.f));
							  ly1.setVisibility(1);
							//搖動手機後，再伴隨震動提示~~
							//vibrator.vibrate(500);
							mFULL = true;}
						if(gesture==7){
							lastUpdate = actualTime;
							 ly1=(ImageView)findViewById(R.id.imageView1);
							  ly1.setImageDrawable(getResources().getDrawable(R.drawable.g));
							  ly1.setVisibility(1);
							  
							//搖動手機後，再伴隨震動提示~~
							//vibrator.vibrate(500);
							mFULL = true;
							}
						
						//mHand.setText(mGest[gesture]);
						//mHand.setBackgroundColor(mBackColor[gesture]);
						//mHand.setTextColor(mForeColor[gesture]);
					}else if (mFULL && shake > 3) {
						// mHand.setText(String.format("y=%.2f \n mY=%.2f \n shake=%.2f", y, mY, shake));
						lastUpdate = actualTime;
						mFULL = false;
					}
				}
			}

}
