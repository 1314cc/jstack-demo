```
2019-05-23 16:25:43
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.144-b01 mixed mode):

"Attach Listener" #12 daemon prio=9 os_prio=31 tid=0x00007ffd02874800 nid=0x4203 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"thread-2" #11 prio=5 os_prio=31 tid=0x00007ffd01091800 nid=0x3e03 waiting for monitor entry [0x00007000046a2000]
   java.lang.Thread.State: BLOCKED (on object monitor)
	at com.jvm.jstack.demo.waiting_on_condition.Demo1$Demo1Run.run(demo1.java:44)
	- waiting to lock <0x000000076ada33b0> (a java.lang.String)
	at java.lang.Thread.run(Thread.java:748)

"thread-1" #10 prio=5 os_prio=31 tid=0x00007ffd01090800 nid=0x4403 waiting on condition [0x000070000459f000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
	at java.lang.Thread.sleep(Native Method)
	at com.jvm.jstack.demo.waiting_on_condition.Demo1$Demo1Run.run(demo1.java:46)
	- locked <0x000000076ada33b0> (a java.lang.String)
	at java.lang.Thread.run(Thread.java:748)

"Service Thread" #9 daemon prio=9 os_prio=31 tid=0x00007ffd02006800 nid=0x3a03 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C1 CompilerThread2" #8 daemon prio=9 os_prio=31 tid=0x00007ffd02087000 nid=0x4703 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread1" #7 daemon prio=9 os_prio=31 tid=0x00007ffd0202a000 nid=0x3903 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #6 daemon prio=9 os_prio=31 tid=0x00007ffd0180d000 nid=0x3803 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Monitor Ctrl-Break" #5 daemon prio=5 os_prio=31 tid=0x00007ffd0287e000 nid=0x3703 runnable [0x0000700003f8d000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:171)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
	at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
	at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
	- locked <0x000000076ac831d0> (a java.io.InputStreamReader)
	at java.io.InputStreamReader.read(InputStreamReader.java:184)
	at java.io.BufferedReader.fill(BufferedReader.java:161)
	at java.io.BufferedReader.readLine(BufferedReader.java:324)
	- locked <0x000000076ac831d0> (a java.io.InputStreamReader)
	at java.io.BufferedReader.readLine(BufferedReader.java:389)
	at com.intellij.rt.execution.application.AppMainV2$1.run(AppMainV2.java:64)

"Signal Dispatcher" #4 daemon prio=9 os_prio=31 tid=0x00007ffd01043000 nid=0x3607 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" #3 daemon prio=8 os_prio=31 tid=0x00007ffd02005800 nid=0x2d03 in Object.wait() [0x0000700003d87000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x000000076ab08ec8> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
	- locked <0x000000076ab08ec8> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:164)
	at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:209)

"Reference Handler" #2 daemon prio=10 os_prio=31 tid=0x00007ffd01017000 nid=0x2c03 in Object.wait() [0x0000700003c84000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x000000076ab06b68> (a java.lang.ref.Reference$Lock)
	at java.lang.Object.wait(Object.java:502)
	at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
	- locked <0x000000076ab06b68> (a java.lang.ref.Reference$Lock)
	at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

"main" #1 prio=5 os_prio=31 tid=0x00007ffd01803800 nid=0x1803 in Object.wait() [0x0000700003672000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x000000076ada85b8> (a java.lang.Thread)
	at java.lang.Thread.join(Thread.java:1252)
	- locked <0x000000076ada85b8> (a java.lang.Thread)
	at java.lang.Thread.join(Thread.java:1326)
	at com.jvm.jstack.demo.waiting_on_condition.Demo1.main(demo1.java:29)

"VM Thread" os_prio=31 tid=0x00007ffd02005000 nid=0x2b03 runnable 

"GC task thread#0 (ParallelGC)" os_prio=31 tid=0x00007ffd01009000 nid=0x2207 runnable 

"GC task thread#1 (ParallelGC)" os_prio=31 tid=0x00007ffd01009800 nid=0x2003 runnable 

"GC task thread#2 (ParallelGC)" os_prio=31 tid=0x00007ffd02815800 nid=0x2a03 runnable 

"GC task thread#3 (ParallelGC)" os_prio=31 tid=0x00007ffd0100a800 nid=0x5303 runnable 

"VM Periodic Task Thread" os_prio=31 tid=0x00007ffd02848000 nid=0x3c03 waiting on condition 

JNI global references: 22

```

## 分析: 
1. `thread-2` 线程状态为`BLOCKED`, `waiting for monitor entry`
等待线程2释放锁, waiting to lock <0x000000076ada33b0> (a java.lang.String) 
2. `thread-1` 线程状态为`TIMED_WAITING`,在等待`sleep`执行完成, `waiting on condition`
拥有锁 locked <0x000000076ada33b0>.

3. `main`线程状态为 `WAITING`, in Object.wait(),因为调用了Object中的join方法
```java
public final synchronized void join(long millis)
    throws InterruptedException {
        long base = System.currentTimeMillis();
        long now = 0;

        if (millis < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (millis == 0) {
            while (isAlive()) {
                wait(0);
            }
        } else {
            while (isAlive()) {
                long delay = millis - now;
                if (delay <= 0) {
                    break;
                }
                wait(delay);
                now = System.currentTimeMillis() - base;
            }
        }
    }
```

