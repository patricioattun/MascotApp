package com.codepatrick.mascotapp;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {
    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;

    }
    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewmascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder , int position) {
        final Mascota mascot = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascot.getImagen());
        mascotaViewHolder.tvrank.setText(String.valueOf(mascot.getRank()));
        mascotaViewHolder.tvNombre.setText(mascot.getNombre());

        mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Diste Like a: "+mascot.getNombre(), Toast.LENGTH_SHORT).show();
             //   Intent intent = new Intent(activity, DetalleContacto.class);
         //       intent.putExtra("nombre",contacto.getNombre());
          //      intent.putExtra("tel", contacto.getTel());
             //   intent.putExtra("email", contacto.getEmail());
              //  activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvrank;
        private ImageButton imgLk;
        private ImageButton imgBtn;
        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.fotoMascota);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombrecv);
            tvrank = (TextView) itemView.findViewById(R.id.tvrank);
            imgLk = (ImageButton) itemView.findViewById(R.id.btnLk);
            imgBtn = (ImageButton) itemView.findViewById(R.id.btnHuesoAmarillo);
        }
    }
}
