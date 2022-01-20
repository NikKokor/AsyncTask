package com.example.asynctask

import android.os.AsyncTask
import android.widget.TextView
import java.util.concurrent.TimeUnit

var i = 0;

class FakeLoading(text: TextView): AsyncTask<Void, Void, String>() {
    var textField = text

    override fun onPreExecute() {
        super.onPreExecute()
        textField.text = "Loading"
    }

    override fun doInBackground(vararg p0: Void?): String {
        try {
            TimeUnit.SECONDS.sleep(2);
            i++;
        } catch (e: InterruptedException) {
            e.printStackTrace();
        }
        return "Load completed, $i"
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        textField.text = result
    }
}