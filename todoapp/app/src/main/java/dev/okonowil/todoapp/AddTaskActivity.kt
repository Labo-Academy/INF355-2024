package dev.okonowil.todoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AddTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_task)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val saveButton = findViewById<Button>(R.id.saveButton)
        val cancelButton = findViewById<Button>(R.id.cancelButton)
        val titleView = findViewById<EditText>(R.id.editTextTitle)
        val descriptionView = findViewById<EditText>(R.id.editTextTextMultiLine)

        saveButton.setOnClickListener{
            val title = titleView.text.toString()
            val description = descriptionView.text.toString()
            val intent = Intent()

            if (title.isNotEmpty() && description.isNotEmpty())
            {
                intent.putExtra("EXTRA_TITLE", title)
                intent.putExtra("EXTRA_DESC", description)
                setResult(RESULT_OK, intent)
            } else {
                setResult(RESULT_CANCELED)
            }
            finish()
        }
    }
}