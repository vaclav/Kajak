<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:96b69737-102c-4334-aa34-66916defc1b6(JSKajak.sandbox.samples)">
  <persistence version="7" />
  <language namespace="9e572cc0-ff2e-47e1-931a-568ddfca6227(JSKajak)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="c643" modelUID="r:e43dfd95-c0a4-423f-843e-d196e5bbf5cf(JSKajak.structure)" version="1" implicit="yes" />
  <roots>
    <node type="c643.JSScript" typeId="c643.3265739055509356615" id="3265739055509541190">
      <property name="name" nameId="tpck.1169194664001" value="Foo" />
    </node>
  </roots>
  <root id="3265739055509541190">
    <node role="statements" roleId="c643.3265739055509367032" type="c643.VarDeclaration" typeId="c643.3265739055509367567" id="3265739055509541191">
      <property name="name" nameId="tpck.1169194664001" value="a" />
      <property name="initialValue" nameId="c643.3265739055509367569" value="10" />
    </node>
    <node role="statements" roleId="c643.3265739055509367032" type="c643.VarDeclaration" typeId="c643.3265739055509367567" id="3265739055509541193">
      <property name="name" nameId="tpck.1169194664001" value="b" />
      <property name="initialValue" nameId="c643.3265739055509367569" value="20" />
    </node>
    <node role="statements" roleId="c643.3265739055509367032" type="c643.DrawFunction" typeId="c643.3265739055509510709" id="3265739055509541195">
      <node role="statements" roleId="c643.3265739055509510710" type="c643.Rect" typeId="c643.3265739055509510951" id="3265739055509541197">
        <link role="x" roleId="c643.3265739055509510952" targetNodeId="3265739055509541191" resolveInfo="a" />
        <link role="y" roleId="c643.3265739055509510953" targetNodeId="3265739055509541193" resolveInfo="b" />
      </node>
      <node role="statements" roleId="c643.3265739055509510710" type="c643.VariableChange" typeId="c643.3265739055509510771" id="3265739055509554337">
        <property name="delta" nameId="c643.3265739055509510773" value="10" />
        <node role="variable" roleId="c643.3265739055509551062" type="c643.VarReference" typeId="c643.3265739055509541893" id="3265739055509558776">
          <link role="declaration" roleId="c643.3265739055509541894" targetNodeId="3265739055509541191" resolveInfo="a" />
        </node>
      </node>
      <node role="statements" roleId="c643.3265739055509510710" type="c643.VariableChange" typeId="c643.3265739055509510771" id="3265739055509559107">
        <property name="delta" nameId="c643.3265739055509510773" value="20" />
        <node role="variable" roleId="c643.3265739055509551062" type="c643.VarReference" typeId="c643.3265739055509541893" id="3265739055509559109">
          <link role="declaration" roleId="c643.3265739055509541894" targetNodeId="3265739055509541193" resolveInfo="b" />
        </node>
      </node>
    </node>
  </root>
</model>

