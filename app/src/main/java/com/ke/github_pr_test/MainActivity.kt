package com.ke.github_pr_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun showAlertDialog() {
        //等待别人来贡献完成
    }

    private fun showListDialog() {
        //等别人Fork之后在添加的代码，用来检测提交者有没有在提交之前和仓库进行同步
        AlertDialog.Builder(this)
                .setSingleChoiceItems(arrayOf("1", "2"), 0, null)
                .show()
    }
}