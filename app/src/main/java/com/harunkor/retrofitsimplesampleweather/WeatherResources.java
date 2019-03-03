package com.harunkor.retrofitsimplesampleweather;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class WeatherResources {


    @SerializedName("cod")
    public String cod;

    @SerializedName("message")
    public String message;

    @SerializedName("cnt")
    public Integer cnt;


    @SerializedName("list")
    public List<ListData> list = new ArrayList<>();


    @SerializedName("city")
    public City city;





    public class ListData {

        @SerializedName("dt")
        public Integer dt;

        @SerializedName("main")
        public Main main;


        @SerializedName("weather")
        public List<weatherListData> weatherlist = new ArrayList();


        @SerializedName("clouds")
        public Clouds clouds;


        @SerializedName("wind")
        public Wind wind;


        @SerializedName("rain")
        public Rain rain;


        @SerializedName("sys")
        public Rain sys;


        @SerializedName("dt_txt")
        public String dt_txt;



    }


    public  class City {

        @SerializedName("id")
        public Integer id;
        @SerializedName("name")
        public String name;
        @SerializedName("coord")
        public Coord coord ;
        @SerializedName("country")
        public String country ;



    }







    public  class Coord {


        @SerializedName("lat")
        public double lat;
        @SerializedName("lon")
        public double lon;



    }



// in

    public class Main  {

        @SerializedName("grnd_level")
        public double grnd_level;

        @SerializedName("humidity")
        public Integer humidity;

        @SerializedName("pressure")
        public double pressure;

        @SerializedName("sea_level")
        public double sea_level;


        @SerializedName("temp")
        public double temp;


        @SerializedName("temp_kf")
        public double temp_kf;

        @SerializedName("temp_max")
        public double temp_max;

        @SerializedName("temp_min")
        public double temp_min;




    }


    public  class  Clouds  {



        @SerializedName("all")
        public String all;


    }


    public  class  Wind  {



        @SerializedName("speed")
        public double speed;

        @SerializedName("deg")
        public double deg;


    }


    public  class Rain {

        @SerializedName("3h")
        public double t3;

    }



    public  class Sys {

        @SerializedName("pod")
        public String pod;

    }



    public class weatherListData {

        @SerializedName("id")
        public Integer id;

        @SerializedName("main")
        public String main;

        @SerializedName("description")
        public String description;


        @SerializedName("icon")
        public String icon;



    }


}
