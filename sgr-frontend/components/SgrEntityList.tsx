import SgrEntity from "@/data/SgrEntity";

export interface SgrEntityListProps {
    sgrEntities: SgrEntity[]
}

export default function SgrEntityList(props: SgrEntityListProps) {
    return props.sgrEntities?.map(sgrEntity =>
        <div key={sgrEntity.id}>{sgrEntity.id} : {sgrEntity.sgrString}</div>
    );
}