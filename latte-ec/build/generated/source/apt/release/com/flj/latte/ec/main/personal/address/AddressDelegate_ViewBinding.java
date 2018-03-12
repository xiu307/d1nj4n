// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.main.personal.address;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddressDelegate_ViewBinding implements Unbinder {
  private AddressDelegate target;

  @UiThread
  public AddressDelegate_ViewBinding(AddressDelegate target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_address, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddressDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
