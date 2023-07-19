package ru.netology.nmedia.application;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NMediaApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NMediaApplication_GeneratedInjector {
  void injectNMediaApplication(NMediaApplication nMediaApplication);
}
