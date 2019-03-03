package com.harunkor.retrofitsimplesampleweather;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public  ApiRetroInterface apiRetroInterface;
    public TextView txtCity;
    public TextView txtTemp;
    public TextView txtMinTemp;
    public TextView txtMaxTemp;
    public TextView txtMon;
    public TextView txtTue;
    public TextView txtWed;
    public TextView txtThu;
    public TextView txtFri;
    public TextView txtSatu;
    public TextView txtSun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCity=(TextView) findViewById(R.id.txt_city);
        txtTemp=(TextView) findViewById(R.id.txt_temp);
        txtMinTemp=(TextView) findViewById(R.id.txt_mintemp);
        txtMaxTemp=(TextView) findViewById(R.id.txt_maxtemp);
        txtMon=(TextView) findViewById(R.id.txt_mon);
        txtTue=(TextView) findViewById(R.id.txt_tue);
        txtWed=(TextView) findViewById(R.id.txt_wed);
        txtThu=(TextView) findViewById(R.id.txt_thu);
        txtFri=(TextView) findViewById(R.id.txt_fri);

        txtSatu=(TextView) findViewById(R.id.txt_satu);
        txtSun=(TextView) findViewById(R.id.txt_sun);





        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        apiRetroInterface=ApiLoginClient.ClientLogin().create(ApiRetroInterface.class);

       // https://api.openweathermap.org/data/2.5/forecast?id=2750405&APPID=9ecf7b693a6624e15824f548885247c1

        Call<WeatherResources> call = apiRetroInterface.GetWeatherAll("2750405","9ecf7b693a6624e15824f548885247c1");
        call.enqueue(new Callback<WeatherResources>() {
            @Override
            public void onResponse(Call<WeatherResources> call, Response<WeatherResources> response) {

              WeatherResources resource = response.body();
              String city_name=resource.city.name;

              Double dtemp=(resource.list.get(0).main.temp -272.15);
              Double mindtemp=(resource.list.get(0).main.temp_min -272.15);
              Double maxdtemp=(resource.list.get(0).main.temp_max -272.15);
              String temp= String.format("%.1f", dtemp);
              String mintemp=  String.format("%.1f", mindtemp);
              String maxtemp= String.format("%.1f", maxdtemp);



               //Mon
                Double mindtemp2=(resource.list.get(1).main.temp_min -272.15);
                Double maxdtemp2=(resource.list.get(1).main.temp_max -272.15);

                String mintemp2= String.format("%.1f", mindtemp2);
                String maxtemp2= String.format("%.1f", maxdtemp2);

                //


                //Tue
                Double mindtemp3=(resource.list.get(9).main.temp_min -272.15);
                Double maxdtemp3=(resource.list.get(9).main.temp_max -272.15);

                String mintemp3= String.format("%.1f", mindtemp3);
                String maxtemp3= String.format("%.1f", maxdtemp3);

                //



                //wed
                Double mindtemp4=(resource.list.get(17).main.temp_min -272.15);
                Double maxdtemp4=(resource.list.get(17).main.temp_max -272.15);

                String mintemp4= String.format("%.1f", mindtemp4);
                String maxtemp4= String.format("%.1f", maxdtemp4);

                //



                //thu
                Double mindtemp5=(resource.list.get(25).main.temp_min -272.15);
                Double maxdtemp5=(resource.list.get(25).main.temp_max -272.15);

                String mintemp5= String.format("%.1f", mindtemp5);
                String maxtemp5= String.format("%.1f", maxdtemp5);

                //


                //fri
                Double mindtemp6=(resource.list.get(33).main.temp_min -272.15);
                Double maxdtemp6=(resource.list.get(33).main.temp_max -272.15);

                String mintemp6= String.format("%.1f", mindtemp6);
                String maxtemp6= String.format("%.1f", maxdtemp6);






               txtCity.setText(city_name);
               txtTemp.setText(temp);
               txtMinTemp.setText(mintemp);
               txtMaxTemp.setText(maxtemp);
               txtMon.setText(mintemp2+"/"+maxtemp2);
               txtTue.setText(mintemp3+"/"+maxtemp3);
               txtWed.setText(mintemp4+"/"+maxtemp4);
               txtThu.setText(mintemp5+"/"+maxtemp5);
               txtFri.setText(mintemp6+"/"+maxtemp6);

               txtSatu.setText(mintemp6+"/"+maxtemp6);
               txtSun.setText(mintemp6+"/"+maxtemp6);



               




            }

            @Override
            public void onFailure(Call<WeatherResources> call, Throwable t) {


                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();

                Log.d("TAG",""+t.getMessage());


                call.cancel();

            }
        });










    }
}
