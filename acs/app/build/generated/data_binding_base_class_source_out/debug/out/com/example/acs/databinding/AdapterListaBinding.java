// Generated by view binder compiler. Do not edit!
package com.example.acs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.acs.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdapterListaBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView DataAD;

  @NonNull
  public final TextView TextoAD;

  @NonNull
  public final TextView TituloAD;

  private AdapterListaBinding(@NonNull LinearLayout rootView, @NonNull TextView DataAD,
      @NonNull TextView TextoAD, @NonNull TextView TituloAD) {
    this.rootView = rootView;
    this.DataAD = DataAD;
    this.TextoAD = TextoAD;
    this.TituloAD = TituloAD;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterListaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterListaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_lista, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterListaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DataAD;
      TextView DataAD = ViewBindings.findChildViewById(rootView, id);
      if (DataAD == null) {
        break missingId;
      }

      id = R.id.TextoAD;
      TextView TextoAD = ViewBindings.findChildViewById(rootView, id);
      if (TextoAD == null) {
        break missingId;
      }

      id = R.id.TituloAD;
      TextView TituloAD = ViewBindings.findChildViewById(rootView, id);
      if (TituloAD == null) {
        break missingId;
      }

      return new AdapterListaBinding((LinearLayout) rootView, DataAD, TextoAD, TituloAD);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}