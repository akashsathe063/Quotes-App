package com.example.quotes

import android.content.Context
import com.example.quotes.models.Quote
import com.google.gson.Gson
import java.nio.ByteBuffer

object DataManager {
    var data = emptyArray<Quote>()
/**
 * fun loadAssetsFromFile(context: Context):
 *
 * This is the definition of a function called loadAssetsFromFile that takes one argument: context. The context provides access to application-specific resources, like files and assets.
 * val inputStream = context.assets.open("quotes.json"):
 *
 * This line opens the quotes.json file from the assets folder and creates an InputStream object (inputStream) to read the file.
 * val size: Int = inputStream.available():
 *
 * inputStream.available() returns the total number of bytes in the file. This value is stored in the variable size.
 * val buffer = ByteArray(size):
 *
 * A ByteArray (a sequence of bytes) is created with the same size as the number of bytes in the file. This array (buffer) will temporarily hold the file's data.
 * inputStream.read(buffer):
 *
 * This reads the file's data into the buffer array.
 * inputStream.close():
 *
 * After reading the data, the InputStream is closed to free up system resources.
 * val json = String(buffer, Charsets.UTF_8):
 *
 * The byte array buffer is converted into a String using UTF-8 encoding, resulting in the json string, which contains the JSON content of the file.
 * val gson = Gson():
 *
 * A Gson object is created. Gson is a library used to convert JSON data into objects and vice versa.
 * data = gson.fromJson(json, Array<Quote>::class.java):
 *
 * The fromJson method of the Gson object is used to convert the json string into an array of Quote objects (Array<Quote>). This array is stored in the variable data.
 * **/

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
    }
}