package my.edu.aiu.shelved;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTitle;
    private EditText editPrice;
    private Button btnBoughtDate;
    private Button btnAddBook;
    private Button btnListBook;
    private TextView textBoughtDate;
    private TextView textBookTypeRegular;
    private TextView textBookTypeEBook;

    private Book book;
    private boolean isEBook = false;

    private int defaultBookColorState = 0xFFFFFFFF; // AARRGGBB
    private int selectedBookColorState = 0xFFEEEEEE; // AARRGGBB

    private int bookId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTitle = findViewById(R.id.editTitle);
        editPrice = findViewById(R.id.editPrice);
        btnBoughtDate = findViewById(R.id.buttonBoughtDate);
        btnAddBook = findViewById(R.id.buttonAdd);
        btnListBook = findViewById(R.id.buttonList);
        textBoughtDate = findViewById(R.id.textBoughtDate);
        textBookTypeRegular = findViewById(R.id.textBookTypeRegular);
        textBookTypeEBook = findViewById(R.id.textBookTypeEBook);

        btnBoughtDate.setOnClickListener(MainActivity.this);
        btnAddBook.setOnClickListener(MainActivity.this);
        btnListBook.setOnClickListener(MainActivity.this);
        textBookTypeRegular.setOnClickListener(MainActivity.this);
        textBookTypeEBook.setOnClickListener(MainActivity.this);

        textBookTypeRegular.setBackgroundColor(defaultBookColorState);
        textBookTypeEBook.setBackgroundColor(defaultBookColorState);

        textBoughtDate.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonBoughtDate) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    MainActivity.this,
                    (view, year, month, dayOfMonth) -> textBoughtDate
                            .setText(String.format(
                                    Locale.ENGLISH,
                                    "%02d-%02d-%04d",
                                    dayOfMonth, month + 1, year
                            )),

                    LocalDate.now().getYear(),
                    LocalDate.now().getMonthValue(),
                    LocalDate.now().getDayOfMonth()
            );
            datePickerDialog.show();
        } else if (v.getId() == R.id.textBookTypeRegular) {
            textBookTypeEBook.setBackgroundColor(defaultBookColorState);
            textBookTypeRegular.setBackgroundColor(selectedBookColorState);
            isEBook = false;
        } else if (v.getId() == R.id.textBookTypeEBook) {
            textBookTypeRegular.setBackgroundColor(defaultBookColorState);
            textBookTypeEBook.setBackgroundColor(selectedBookColorState);
            isEBook = true;
        } else if (v.getId() == R.id.buttonAdd) {



        } else if (v.getId() == R.id.buttonList) {

        }
    }

    private void resetInput(){
        editTitle.setText("");
        editPrice.setText("");
        textBoughtDate.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        textBookTypeRegular.setBackgroundColor(defaultBookColorState);
        textBookTypeEBook.setBackgroundColor(defaultBookColorState);
    }








}