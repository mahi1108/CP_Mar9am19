package cubex.mahesh.cp_mar9am19

import android.database.Cursor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.widget.CursorAdapter
import android.widget.SimpleCursorAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

  /*1*/      var resolver = contentResolver
  /*2*/      var contacts_uri = ContactsContract.CommonDataKinds.
            Phone.CONTENT_URI
       // CallLog.Calls.CONTENT_URI
/* 3 */        var c:Cursor = resolver.query(contacts_uri,
            null,
            null,null,null)
/* 4*/        var cAdapter = SimpleCursorAdapter(
            this@MainActivity,
            R.layout.indiview,
            c,
            arrayOf(ContactsContract.CommonDataKinds.
   Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.
                    Phone.NUMBER),
            intArrayOf(R.id.tv1,R.id.tv2),0)
/* 5 */            lview.adapter = cAdapter

    }
}
