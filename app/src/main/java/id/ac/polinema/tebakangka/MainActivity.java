package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText nameInput;
	private TextView outputText;
	private int nomer = (int)(Math.random()*100);



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nameInput = findViewById(R.id.number_input);
		outputText = findViewById(R.id.text_output);
		// TODO: bind layout di sini
	}

	// TODO: generate angka random di sini

	private void initRandomNumber() {
		this.nomer = (int)(Math.random()*100);
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		int inputan = Integer.parseInt(nameInput.getText().toString());

		if (inputan == nomer){
			outputText.setText("Anda Benar");
		}

		if (inputan < nomer){
			outputText.setText("Lebih Besar");
		}

		if (inputan > nomer){
			outputText.setText("Lebih Kecil");
		}
	}

	public void handleReset(View view) {
		outputText.setText("");
		nameInput.setText("");
		nomer = (int)(Math.random()*100);
		// TODO: Reset tampilan

	}
}
