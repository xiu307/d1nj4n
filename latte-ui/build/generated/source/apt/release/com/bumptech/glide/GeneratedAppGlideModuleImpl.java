package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import com.flj.latte.ui.image.LatteGlideModel;
import java.lang.Class;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.Set;

@SuppressWarnings("deprecation")
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
  private final LatteGlideModel appGlideModule;

  GeneratedAppGlideModuleImpl() {
    appGlideModule = new LatteGlideModel();
    if (Log.isLoggable("Glide", Log.DEBUG)) {
      Log.d("Glide", "Discovered AppGlideModule from annotation: com.flj.latte.ui.image.LatteGlideModel");
      Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
    }
  }

  @Override
  public void applyOptions(Context context, GlideBuilder builder) {
    appGlideModule.applyOptions(context, builder);
  }

  @Override
  public void registerComponents(Context context, Registry registry) {
    new OkHttpLibraryGlideModule().registerComponents(context, registry);
    appGlideModule.registerComponents(context, registry);
  }

  @Override
  public boolean isManifestParsingEnabled() {
    return appGlideModule.isManifestParsingEnabled();
  }

  @Override
  public Set<Class<?>> getExcludedModuleClasses() {
    return Collections.emptySet();
  }

  @Override
  GeneratedRequestManagerFactory getRequestManagerFactory() {
    return new GeneratedRequestManagerFactory();
  }
}
