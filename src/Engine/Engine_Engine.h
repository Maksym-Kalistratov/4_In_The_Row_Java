/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class Engine_Engine */

#ifndef _Included_Engine_Engine
#define _Included_Engine_Engine
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     Engine_Engine
 * Method:    getColor
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_Engine_Engine_getColor
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     Engine_Engine
 * Method:    nextMove
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_Engine_Engine_nextMove
  (JNIEnv *, jclass, jint);

/*
 * Class:     Engine_Engine
 * Method:    getState
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_Engine_Engine_getState
  (JNIEnv *, jclass);

/*
 * Class:     Engine_Engine
 * Method:    getTurn
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_Engine_Engine_getTurn
  (JNIEnv *, jclass);

/*
 * Class:     Engine_Engine
 * Method:    resetBoard
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL Java_Engine_Engine_resetBoard
  (JNIEnv *, jclass, jboolean);

/*
 * Class:     Engine_Engine
 * Method:    getCount
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_Engine_Engine_getCount
  (JNIEnv *, jclass, jint);

/*
 * Class:     Engine_Engine
 * Method:    getBoardSize
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_Engine_Engine_getBoardSize__
  (JNIEnv *, jclass);

/*
 * Class:     Engine_Engine
 * Method:    getBoardSize
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_Engine_Engine_getBoardSize__I
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif
#endif
