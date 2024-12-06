package dev.okonowil.todoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var resultLauncher : ActivityResultLauncher<Intent>
    var taskList : MutableList<MyTask> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val addButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val listViewTask = findViewById<ListView>(R.id.listView)

        resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->
            if ( result.resultCode == RESULT_OK){
                val task = MyTask(result.data?.getStringExtra("EXTRA_TITLE") ?: "", result.data?.getStringExtra("EXTRA_DESC") ?: "")
                taskList.add(task)
                val adapterResult = TaskAdapter(this, R.layout.item_task, taskList)
                listViewTask.adapter = adapterResult
            }
        }

        val adapter = TaskAdapter(this, R.layout.item_task, taskList)
        listViewTask.adapter = adapter

        addButton.setOnClickListener {
            val intent = Intent(this, AddTaskActivity::class.java)
            resultLauncher.launch(intent)
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d("Todo App", "MainActivity onStart")
    }
}


