#include<jni.h>
#include<stdio.h>
#include "HelloJNI.h"
{
    JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv *env, jobject thisobj)
    printf("Hello world");
    return;
}