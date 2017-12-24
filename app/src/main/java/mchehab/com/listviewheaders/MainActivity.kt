package mchehab.com.listviewheaders

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<String>()
        for (i in 0..30){
            list.add("String # $i")
        }
        val arrayAdapter = ArrayAdapter<String>(this@MainActivity, android.R.layout
                .simple_list_item_1, list)
        listView.adapter = arrayAdapter
        listView.addHeaderView(layoutInflater.inflate(R.layout.listview_header, null))
        listView.addFooterView(layoutInflater.inflate(R.layout.listview_footer, null))
    }
}