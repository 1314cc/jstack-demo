```
2019-05-23 16:51:35
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.144-b01 mixed mode):

"Attach Listener" #12 daemon prio=9 os_prio=31 tid=0x00007fcb07088000 nid=0x3f03 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"thread-2" #11 prio=5 os_prio=31 tid=0x00007fcb07856000 nid=0x4403 waiting for monitor entry [0x0000700010b46000]
   java.lang.Thread.State: BLOCKED (on object monitor)
	at com.jvm.jstack.demo.deadlock.Demo1$DeadLockRun2.run(Demo1.java:64)
	- waiting to lock <0x000000076aeea750> (a java.lang.String)
	- locked <0x000000076aeea790> (a java.lang.String)
	at java.lang.Thread.run(Thread.java:748)

"thread-1" #10 prio=5 os_prio=31 tid=0x00007fcb07833000 nid=0x4603 waiting for monitor entry [0x0000700010a43000]
   java.lang.Thread.State: BLOCKED (on object monitor)
	at com.jvm.jstack.demo.deadlock.Demo1$DeadLockRun1.run(Demo1.java:50)
	- waiting to lock <0x000000076aeea790> (a java.lang.String)
	- locked <0x000000076aeea750> (a java.lang.String)
	at java.lang.Thread.run(Thread.java:748)

"Service Thread" #9 daemon prio=9 os_prio=31 tid=0x00007fcb07855000 nid=0x4803 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C1 CompilerThread2" #8 daemon prio=9 os_prio=31 tid=0x00007fcb08046800 nid=0x4a03 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread1" #7 daemon prio=9 os_prio=31 tid=0x00007fcb08025800 nid=0x4c03 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #6 daemon prio=9 os_prio=31 tid=0x00007fcb08880800 nid=0x3b03 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Monitor Ctrl-Break" #5 daemon prio=5 os_prio=31 tid=0x00007fcb0801c000 nid=0x4d03 runnable [0x0000700010431000]
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

"Signal Dispatcher" #4 daemon prio=9 os_prio=31 tid=0x00007fcb0800e800 nid=0x3907 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" #3 daemon prio=8 os_prio=31 tid=0x00007fcb0884d800 nid=0x3103 in Object.wait() [0x000070001022b000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x000000076ab08ec8> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
	- locked <0x000000076ab08ec8> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:164)
	at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:209)

"Reference Handler" #2 daemon prio=10 os_prio=31 tid=0x00007fcb0700e800 nid=0x5403 in Object.wait() [0x0000700010128000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x000000076ab06b68> (a java.lang.ref.Reference$Lock)
	at java.lang.Object.wait(Object.java:502)
	at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
	- locked <0x000000076ab06b68> (a java.lang.ref.Reference$Lock)
	at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

"main" #1 prio=5 os_prio=31 tid=0x00007fcb08002800 nid=0x2803 in Object.wait() [0x000070000fb16000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x000000076aef38e0> (a java.lang.Thread)
	at java.lang.Thread.join(Thread.java:1252)
	- locked <0x000000076aef38e0> (a java.lang.Thread)
	at java.lang.Thread.join(Thread.java:1326)
	at com.jvm.jstack.demo.deadlock.Demo1.main(Demo1.java:34)

"VM Thread" os_prio=31 tid=0x00007fcb07003800 nid=0x2e03 runnable 

"GC task thread#0 (ParallelGC)" os_prio=31 tid=0x00007fcb0800c000 nid=0x2207 runnable 

"GC task thread#1 (ParallelGC)" os_prio=31 tid=0x00007fcb08804000 nid=0x2003 runnable 

"GC task thread#2 (ParallelGC)" os_prio=31 tid=0x00007fcb08816000 nid=0x2a03 runnable 

"GC task thread#3 (ParallelGC)" os_prio=31 tid=0x00007fcb08816800 nid=0x2c03 runnable 

"VM Periodic Task Thread" os_prio=31 tid=0x00007fcb08026800 nid=0x4703 waiting on condition 

JNI global references: 22


Found one Java-level deadlock:
=============================
"thread-2":
  waiting to lock monitor 0x00007fcb0884cea8 (object 0x000000076aeea750, a java.lang.String),
  which is held by "thread-1"
"thread-1":
  waiting to lock monitor 0x00007fcb088bfe08 (object 0x000000076aeea790, a java.lang.String),
  which is held by "thread-2"

Java stack information for the threads listed above:
===================================================
"thread-2":
	at com.jvm.jstack.demo.deadlock.Demo1$DeadLockRun2.run(Demo1.java:64)
	- waiting to lock <0x000000076aeea750> (a java.lang.String)
	- locked <0x000000076aeea790> (a java.lang.String)
	at java.lang.Thread.run(Thread.java:748)
"thread-1":
	at com.jvm.jstack.demo.deadlock.Demo1$DeadLockRun1.run(Demo1.java:50)
	- waiting to lock <0x000000076aeea790> (a java.lang.String)
	- locked <0x000000076aeea750> (a java.lang.String)
	at java.lang.Thread.run(Thread.java:748)

Found 1 deadlock.

```
 
## 分析
1. `thread-2` java.lang.Thread.State: BLOCKED (on object monitor)
2. `thread-2` 拥有锁0x000000076aeea790, 等待锁0x000000076aeea750
3. `thread-1` java.lang.Thread.State: BLOCKED (on object monitor)
4. `thread-1` 拥有锁0x000000076aeea750, 等待锁0x000000076aeea790
5. 死锁