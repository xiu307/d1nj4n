// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.main.personal.settings;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutDelegate_ViewBinding implements Unbinder {
  private AboutDelegate target;

  @UiThread
  public AboutDelegate_ViewBinding(AboutDelegate target, View source) {
    this.target = target;

    target.mTextView = Utils.findRequiredViewAsType(source, R.id.tv_info, "field 'mTextView'", AppCompatTextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTextView = null;
  }
}
