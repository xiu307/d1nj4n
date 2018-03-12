// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.detail;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ImageDelegate_ViewBinding implements Unbinder {
  private ImageDelegate target;

  @UiThread
  public ImageDelegate_ViewBinding(ImageDelegate target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_image_container, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ImageDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
