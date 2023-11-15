package ma.laghridat.controle.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.List;

import ma.laghridat.controle.R;
import ma.laghridat.controle.classes.Employe;

public class EmployeAdapter extends ArrayAdapter<Employe> {

    private List<Employe> filieres;
    private Context context;

    public EmployeAdapter(Context context, List<Employe> filieres) {
        super(context, 0, filieres);
        this.filieres = filieres;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Employe filiere = filieres.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item3, parent, false);
        }


        TextView nom = convertView.findViewById(R.id.nom);
        TextView date = convertView.findViewById(R.id.date);
        TextView service = convertView.findViewById(R.id.service);

        nom.setText("Nom: " + filiere.getPrenom()+""+filiere.getNom());
        date.setText("Date: " + filiere.getDateNaissance());
        service.setText("Telephone: " + filiere.getService());


        return convertView;
    }
}
