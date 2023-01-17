package com.khan.ex1027;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String boxOffice_url;
    RequestQueue queue;
    StringRequest boxOffice_request;

    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_result = findViewById(R.id.tv_result);
        boxOffice_url = "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20090105";

        queue = Volley.newRequestQueue(getApplicationContext());

        boxOffice_request = new StringRequest(Request.Method.GET, boxOffice_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // String 형태의 JSON구조!
                try {
                    JSONObject allData = new JSONObject(response);
                    JSONObject boxOfficeResult = allData.getJSONObject("boxOfficeResult");
                    JSONArray weeklyBoxOfficeList = boxOfficeResult.getJSONArray("weeklyBoxOfficeList");

                    for(int i = 0; i < weeklyBoxOfficeList.length(); i++){
                        JSONObject object_i = weeklyBoxOfficeList.getJSONObject(i);
                        int rank = object_i.getInt("rank");
                        String title = object_i.getString("movieNm");
                        String date = object_i.getString("openDt");

                        String movieDta = rank + ") " + title + " : " + date;
                        tv_result.setText(tv_result.getText() + movieDta + "\n");
                        // 모든 영화정보 누적해서 tv_result에 setText
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return super.getParams();
            }
        };
        queue.add(boxOffice_request);
    }
}