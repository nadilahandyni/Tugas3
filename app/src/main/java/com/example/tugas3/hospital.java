package com.example.tugas3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listHospital = new String[] {"Rumah Sakit Awal Bross", "Rumah Sakit Eka Hospital",
                "Rumah Sakit Jiwa Tampan", "Rumah Sakit Tabrani"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listHospital));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){

        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try{
            Intent a = null;
            if(pilihan.equals("Rumah Sakit Awal Bross")) {
                a = new Intent(this, RSAwalBross.class);
            }else if(pilihan.equals("Rumah Sakit Eka Hospital")){

            }
            startActivity(a);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
