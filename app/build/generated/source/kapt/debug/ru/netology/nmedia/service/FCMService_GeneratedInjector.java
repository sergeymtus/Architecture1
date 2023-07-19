package ru.netology.nmedia.service;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = FCMService.class
)
@GeneratedEntryPoint
@InstallIn(ServiceComponent.class)
public interface FCMService_GeneratedInjector {
  void injectFCMService(FCMService fCMService);
}
