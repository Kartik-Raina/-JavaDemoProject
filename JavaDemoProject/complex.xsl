<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:bb="urn:com.workday.report/Projected_Balances_Outbound">
<xsl:output method="xml" indent="yes"/>

<xsl:template match="/">
 <bb:Report_Data>
   <xsl:apply-templates select="*/*/*/*[starts-with(local-name(),'projectedBalanceTotal.effectiveDate')]"/>
 </bb:Report_Data>
</xsl:template>

<xsl:template match="*">
<!-- Add predicate [starts-with(local-name(),'projectedBalanceTotal.effectiveDate')]
     to the match pattern if you feel like it. -->
   <projectedBalanceTotal>
     <xsl:copy-of select="
       ../../bb:projectedBalanceTotal.principalId  |
       ../bb:projectedBalanceTotal.planCodeId      |
       ../bb:projectedBalanceTotal.leaveCodeId     |
       ../bb:projected_balance_accrual_amount_for_the_pay_period |
       .                                           |
       ../../bb:projectedBalanceTotal.employeeid"   />
   </projectedBalanceTotal>
</xsl:template>

</xsl:stylesheet>