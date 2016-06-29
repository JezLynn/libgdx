/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btAxisSweep3InternalShort extends btBroadphaseInterface {
	private long swigCPtr;
	
	protected btAxisSweep3InternalShort(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btAxisSweep3InternalShort_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btAxisSweep3InternalShort, normally you should not need this constructor it's intended for low-level usage. */
	public btAxisSweep3InternalShort(long cPtr, boolean cMemoryOwn) {
		this("btAxisSweep3InternalShort", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btAxisSweep3InternalShort_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btAxisSweep3InternalShort obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btAxisSweep3InternalShort(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static public class Edge extends BulletBase {
  	private long swigCPtr;
  	
  	protected Edge(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new Edge, normally you should not need this constructor it's intended for low-level usage. */ 
  	public Edge(long cPtr, boolean cMemoryOwn) {
  		this("Edge", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(Edge obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				CollisionJNI.delete_btAxisSweep3InternalShort_Edge(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setPos(int value) {
      CollisionJNI.btAxisSweep3InternalShort_Edge_pos_set(swigCPtr, this, value);
    }
  
    public int getPos() {
      return CollisionJNI.btAxisSweep3InternalShort_Edge_pos_get(swigCPtr, this);
    }
  
    public void setHandle(int value) {
      CollisionJNI.btAxisSweep3InternalShort_Edge_handle_set(swigCPtr, this, value);
    }
  
    public int getHandle() {
      return CollisionJNI.btAxisSweep3InternalShort_Edge_handle_get(swigCPtr, this);
    }
  
    public int IsMax() {
      return CollisionJNI.btAxisSweep3InternalShort_Edge_IsMax(swigCPtr, this);
    }
  
    public Edge() {
      this(CollisionJNI.new_btAxisSweep3InternalShort_Edge(), true);
    }
  
  }

  static public class Handle extends btBroadphaseProxy {
  	private long swigCPtr;
  	
  	protected Handle(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, CollisionJNI.btAxisSweep3InternalShort_Handle_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new Handle, normally you should not need this constructor it's intended for low-level usage. */
  	public Handle(long cPtr, boolean cMemoryOwn) {
  		this("Handle", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(CollisionJNI.btAxisSweep3InternalShort_Handle_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(Handle obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				CollisionJNI.delete_btAxisSweep3InternalShort_Handle(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setMinEdges(int[] value) {
      CollisionJNI.btAxisSweep3InternalShort_Handle_minEdges_set(swigCPtr, this, value);
    }
  
    public int[] getMinEdges() {
      return CollisionJNI.btAxisSweep3InternalShort_Handle_minEdges_get(swigCPtr, this);
    }
  
    public void setMaxEdges(int[] value) {
      CollisionJNI.btAxisSweep3InternalShort_Handle_maxEdges_set(swigCPtr, this, value);
    }
  
    public int[] getMaxEdges() {
      return CollisionJNI.btAxisSweep3InternalShort_Handle_maxEdges_get(swigCPtr, this);
    }
  
    public void setDbvtProxy(btBroadphaseProxy value) {
      CollisionJNI.btAxisSweep3InternalShort_Handle_dbvtProxy_set(swigCPtr, this, btBroadphaseProxy.getCPtr(value), value);
    }
  
    public btBroadphaseProxy getDbvtProxy() {
  	return btBroadphaseProxy.internalTemp(CollisionJNI.btAxisSweep3InternalShort_Handle_dbvtProxy_get(swigCPtr, this), false);
  }
  
    public void SetNextFree(int next) {
      CollisionJNI.btAxisSweep3InternalShort_Handle_SetNextFree(swigCPtr, this, next);
    }
  
    public int GetNextFree() {
      return CollisionJNI.btAxisSweep3InternalShort_Handle_GetNextFree(swigCPtr, this);
    }
  
    public Handle() {
      this(CollisionJNI.new_btAxisSweep3InternalShort_Handle(), true);
    }
  
  }

  public btAxisSweep3InternalShort(Vector3 worldAabbMin, Vector3 worldAabbMax, int handleMask, int handleSentinel, int maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) {
    this(CollisionJNI.new_btAxisSweep3InternalShort__SWIG_0(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache, disableRaycastAccelerator), true);
  }

  public btAxisSweep3InternalShort(Vector3 worldAabbMin, Vector3 worldAabbMax, int handleMask, int handleSentinel, int maxHandles, btOverlappingPairCache pairCache) {
    this(CollisionJNI.new_btAxisSweep3InternalShort__SWIG_1(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache), true);
  }

  public btAxisSweep3InternalShort(Vector3 worldAabbMin, Vector3 worldAabbMax, int handleMask, int handleSentinel, int maxHandles) {
    this(CollisionJNI.new_btAxisSweep3InternalShort__SWIG_2(worldAabbMin, worldAabbMax, handleMask, handleSentinel, maxHandles), true);
  }

  public btAxisSweep3InternalShort(Vector3 worldAabbMin, Vector3 worldAabbMax, int handleMask, int handleSentinel) {
    this(CollisionJNI.new_btAxisSweep3InternalShort__SWIG_3(worldAabbMin, worldAabbMax, handleMask, handleSentinel), true);
  }

  public int getNumHandles() {
    return CollisionJNI.btAxisSweep3InternalShort_getNumHandles(swigCPtr, this);
  }

  public int addHandle(Vector3 aabbMin, Vector3 aabbMax, long pOwner, short collisionFilterGroup, short collisionFilterMask, btDispatcher dispatcher, long multiSapProxy) {
    return CollisionJNI.btAxisSweep3InternalShort_addHandle(swigCPtr, this, aabbMin, aabbMax, pOwner, collisionFilterGroup, collisionFilterMask, btDispatcher.getCPtr(dispatcher), dispatcher, multiSapProxy);
  }

  public void removeHandle(int handle, btDispatcher dispatcher) {
    CollisionJNI.btAxisSweep3InternalShort_removeHandle(swigCPtr, this, handle, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void updateHandle(int handle, Vector3 aabbMin, Vector3 aabbMax, btDispatcher dispatcher) {
    CollisionJNI.btAxisSweep3InternalShort_updateHandle(swigCPtr, this, handle, aabbMin, aabbMax, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public btAxisSweep3InternalShort.Handle getHandle(int index) {
    long cPtr = CollisionJNI.btAxisSweep3InternalShort_getHandle(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btAxisSweep3InternalShort.Handle(cPtr, false);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btAxisSweep3InternalShort_rayTest__SWIG_0(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin, aabbMax);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin) {
    CollisionJNI.btAxisSweep3InternalShort_rayTest__SWIG_1(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback) {
    CollisionJNI.btAxisSweep3InternalShort_rayTest__SWIG_2(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback);
  }

  public void quantize(java.nio.IntBuffer out, Vector3 point, int isMax) {
    assert out.isDirect() : "Buffer must be allocated direct.";
    {
      CollisionJNI.btAxisSweep3InternalShort_quantize(swigCPtr, this, out, point, isMax);
    }
  }

  public void unQuantize(btBroadphaseProxy proxy, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btAxisSweep3InternalShort_unQuantize(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy, aabbMin, aabbMax);
  }

  public boolean testAabbOverlap(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
    return CollisionJNI.btAxisSweep3InternalShort_testAabbOverlap(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1);
  }

  public btOverlappingPairCache getOverlappingPairCache() {
    long cPtr = CollisionJNI.btAxisSweep3InternalShort_getOverlappingPairCache__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlappingPairCache(cPtr, false);
  }

  public void setOverlappingPairUserCallback(btOverlappingPairCallback pairCallback) {
    CollisionJNI.btAxisSweep3InternalShort_setOverlappingPairUserCallback(swigCPtr, this, btOverlappingPairCallback.getCPtr(pairCallback), pairCallback);
  }

  public btOverlappingPairCallback getOverlappingPairUserCallback() {
    long cPtr = CollisionJNI.btAxisSweep3InternalShort_getOverlappingPairUserCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlappingPairCallback(cPtr, false);
  }

}
